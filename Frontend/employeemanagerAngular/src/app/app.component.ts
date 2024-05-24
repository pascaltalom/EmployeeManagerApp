import { Component } from '@angular/core';
import { RouterOutlet } from '@angular/router';
import { Employee } from './employee';
import { HttpErrorResponse } from '@angular/common/http';
import { EmployeeService } from './employee.service';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrl: './app.component.css'
})
export class AppComponent {
  public employees!: Employee[];

  constructor(private employeeService: EmployeeService){}

  ngOnInit(): void {
    this.getEmployees();
  }

  public getEmployees():void{
    this.employeeService.getEmployees().subscribe(
      (Response: Employee[]) => {
      this.employees = Response;
    },
    (error: HttpErrorResponse) =>{
      alert(error.message);
    }
    );
  }
}
