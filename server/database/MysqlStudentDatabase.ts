import {DatabaseStudentSource} from "./connector/databaseI";
import {StudentI} from "../model/studentModels";
import {MysqlDataSource} from "./MysqlDataSource";

export  class MysqlStudentDatabase extends MysqlDataSource implements DatabaseStudentSource{
    public getAllStudents(): StudentI[] {
        //get connection

        return [{
            fullname: 'joshua mshana',
            address: ' makumbusho',
            courses:{
                id:1,
                lecture: 'muomi',
                name: 'digital'
            },
            email: 'email@',
            id:1
        },
            {
                fullname: 'joshua 2',
                address: ' makumbusho',
                courses:{
                    id:1,
                    lecture: 'muomi',
                    name: 'digital'
                },
                email: 'email@',
                id:1
            }];
    }

    public getStudent(id: number): StudentI {
        return {
            fullname: 'joshua mshana',
            address: ' makumbusho',
            courses:{
                id:1,
                lecture: 'muomi',
                name: 'digital'
            },
            email: 'email@',
            id:1
        };
    }

}