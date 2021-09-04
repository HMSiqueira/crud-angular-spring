import { HttpClient, HttpParams } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { environment } from 'src/environments/environment';
import { ServicoPrestadoBusca } from './servico-prestado/servico-prestado-list/servicoPrestadoBusca';
import { ServicoPrestado } from './servico-prestado/servicoPrestado';

@Injectable({
  providedIn: 'root'
})
export class ServicoPrestadoService {

  constructor( private http: HttpClient) { }

  apiURL: string = environment.apiURLBase + "/api/servicos-prestados";

  salvar(servicoPrestado: ServicoPrestado) : Observable<ServicoPrestado>{
    return this.http.post<ServicoPrestado>(this.apiURL, servicoPrestado);
  }

  buscar(nome: string, mes: number) : Observable<ServicoPrestadoBusca[]>{
    const httpParams = new HttpParams()
                            .set("nome", nome)
                            .set("mes", mes ? mes.toString() : "");

    const url = this.apiURL + "?" + httpParams.toString();
    //exemplo url = ../api/servicos-prestados?nome=Maria&mes=5
    return this.http.get<any>(url);
  }
}
