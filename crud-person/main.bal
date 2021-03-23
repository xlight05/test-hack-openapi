import ballerina/http;

// listener http:Listener personEp = new http:Listener(9090);
listener http:Listener personEp = new (9090);

type Person record {
    int id;
    string fname;
    string lname;
    int age;
};

type PersonInput record {
    string fname;
    string lname;
    int age;
};

Person[] personList = [];

service http:Service /api/person on personEp {

    resource function get .(http:Request req) returns json[] {
        json[] jsonArr = [];
        foreach Person entry in personList {
            json|error cloneWithType = entry.cloneWithType(json);
            if (cloneWithType is json) {
                jsonArr.push(cloneWithType);
            }
        }
        return jsonArr;
    }

    resource function get [int id](http:Request req) returns json {
        foreach Person entry in personList {
            int entryId = entry.id;
            if (entryId == id) {
                json|error greeting = entry.cloneWithType(json);
                if (greeting is json) {
                    return greeting;
                }
            }
        }

        json errorJson = {"Message": "Person not found"};
        return errorJson;
    }

    resource function post .(@http:Payload {} PersonInput person) returns json {

        Person newPerson = {
            id: personList.length(),
            fname: person.fname,
            lname: person.lname,
            age: person.age
        };

        personList.push(newPerson);
        json|error greeting = newPerson.cloneWithType(json);
        if (greeting is json) {
            return greeting;
        }
    }

    resource function put .(@http:Payload {} Person person) returns json {
        int index = getIndexOfPerson(person.id);
        personList[index] = person;
        json result = {"Message": "Entry updated"};
        return result;
    }

    resource function delete [int id](http:Request req) returns json {
        int index = getIndexOfPerson(id);
        if (index == -1) {
            json errorJson = {"Message": "Person not found"};
            return errorJson;
        }

        Person entry = personList.remove(index);
        json|error greeting = entry.cloneWithType(json);
        if (greeting is json) {
            return greeting;
        }
    }
}

function getIndexOfPerson(int id) returns int {
    int index = -1;
    foreach int i in 0 ... personList.length() {
        Person entry = personList[i];
        int entryId = entry.id;
        if (entryId == id) {
            return entryId;
        }
    }
    return index;
}
