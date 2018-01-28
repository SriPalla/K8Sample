import { Component, OnInit } from '@angular/core';
import { HttpClient, HttpHeaders, HttpClientModule } from '@angular/common/http';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css'],
  providers: [HttpClient]
})
export class AppComponent implements OnInit {
  records: any;

  constructor(private http: HttpClient) {
  }

  ngOnInit(): void {
    const httpOptions = {
      headers: new HttpHeaders({
        'Access-Control-Allow-Origin': '*'
      })
    };

    this.http.get('http://counterweb:8080/getAllBics', httpOptions).subscribe(data => {
      console.log(data);
      this.records = data;
    });
  }

}
export interface BicData {
  response: Bic[]
}
export interface Bic {
  bicCode: string;
  description: string;
}
