export class Employee {
    id:number=0;
    firstName:string='';
    lastName:string='';
    salary:number=0;

    constructor(id:number, firstName:string, lastName:string, salary:number)
    {
        this.id=id;
        this.firstName=firstName;
        this.lastName=lastName;
        this.salary=salary;
    }
}
