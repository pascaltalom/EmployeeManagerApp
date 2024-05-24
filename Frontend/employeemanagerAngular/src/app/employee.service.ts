import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { Employee } from './employee';

@Injectable({
  providedIn: 'root'
})
export class EmployeeService {

  private apiServerUrl = 'http://localhost:8080';

    constructor(private http: HttpClient){}

    //Get all the employees
    public getEmployees(): Observable<Employee[]>{
        return this.http.get<Employee[]>('${this.apiServerUrl}/employee/all');
    }

    // Add an employee
    public addEmployees(employee: Employee): Observable<Employee>{
        return this.http.post<Employee>('${this.apiServerUrl}/employee/add', employee);
    }

    // Add an employee
    public updateEmployees(employee: Employee): Observable<Employee>{
        return this.http.put<Employee>('${this.apiServerUrl}/employee/update', employee);
    }

    // delete an employee
    public deleteEmployees(employeeId: number): Observable<void>{
        return this.http.delete<void>('${this.apiServerUrl}/employee/delete/${employeeId}');
    }
}
