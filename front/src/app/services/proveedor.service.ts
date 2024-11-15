import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Observable } from 'rxjs';
import { Proveedor } from '../models/proveedor';
import { environment } from 'src/environments/environment';

@Injectable({
  providedIn: 'root'
})
export class ProveedorService {

  constructor(private httClient:HttpClient) { }

  consultarProveedores(): Observable<Proveedor[]>{
    return this.httClient.get<Proveedor[]>(`${environment.url}/proveedor/all`);
  }
}
