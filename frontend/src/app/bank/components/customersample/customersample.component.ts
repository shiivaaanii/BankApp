import { Component } from '@angular/core';
import { FormBuilder, FormGroup, Validators } from '@angular/forms';
import { CustomerTS } from '../../types/tstypes/Customerts';
import { of } from 'rxjs';

@Component({
  selector: 'app-customersample',
  standalone: true,
  imports: [],
  templateUrl: './customersample.component.html',
  styleUrls: ['./customersample.component.css']
})
export class CustomersampleComponent {
  customer:CustomerTS;
  constructor(){
    this.customer = new CustomerTS('4567', 'Shivani', 'shivani@gmail.com', '11111', 'ShivaniiI', 'admin');
    
  }
 
}

