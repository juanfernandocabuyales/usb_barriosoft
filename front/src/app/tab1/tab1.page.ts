import { Component, OnInit } from '@angular/core';
import { IonHeader, IonToolbar, IonTitle, IonContent, IonLabel, IonGrid, IonCol, IonRow, IonIcon } from '@ionic/angular/standalone';
import { ExploreContainerComponent } from '../explore-container/explore-container.component';
import { Proveedor } from '../models/proveedor';
import { ProveedorService } from '../services/proveedor.service';
import { CommonModule } from '@angular/common';

@Component({
  selector: 'app-tab1',
  templateUrl: 'tab1.page.html',
  styleUrls: ['tab1.page.scss'],
  standalone: true,
  imports: [CommonModule,IonIcon, IonRow, IonCol, IonGrid, IonLabel, IonHeader, IonToolbar, IonTitle, IonContent],
})
export class Tab1Page implements OnInit{

  listadoProveedores: Proveedor[];

  constructor(private proveedorService: ProveedorService) {}

  ngOnInit(): void {
    this.proveedorService.consultarProveedores().subscribe({
      next: (resp: Proveedor[]) => {
        this.listadoProveedores = resp;
      },
      error: (error:any) => {
        console.log('error servicio', error);
      }
    });
  }
}
