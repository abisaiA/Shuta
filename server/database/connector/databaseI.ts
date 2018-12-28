import {StudentI} from "../../model/studentModels";

export interface DatabaseStudentSource {
    getAllStudents(): StudentI[];

    getStudent(id: number): StudentI;
}

