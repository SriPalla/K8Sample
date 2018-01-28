import { Component } from '@angular/core';
import { HttpClient } from '@angular/common/http';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent {
  records: any[];

  constructor(private http: HttpClient){
  }

  ngOnInit(): void {
    this.http.get('http://counterweb/getAllBics').subscribe(data => {
      console.log(data.response);
    });
  }

}
