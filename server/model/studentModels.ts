export interface StudentI {
    fullname: string,
    id: number;
    email: string;
    address: string;
    courses: {
        id: number;
        name: string;
        lecture: string
    };
}

