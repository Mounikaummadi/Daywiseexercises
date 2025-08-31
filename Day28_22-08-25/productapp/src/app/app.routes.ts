import { Routes } from '@angular/router';
import { Productlist } from './productlist/productlist';
import { Productadd } from './productadd/productadd';
import { Productedit } from './productedit/productedit';
import { Productdelete } from './productdelete/productdelete';
import { Ordercomp } from './ordercomp/ordercomp';
import { OrderHistory } from './order-history/order-history';


export const routes: Routes = [
  { path: '', redirectTo: 'productlist', pathMatch: 'full' },
  { path: 'productlist', component: Productlist },
  { path: 'productadd', component: Productadd},
  { path: 'productedit/:id', component: Productedit },
  { path: 'productdelete/:id', component: Productdelete },
  { path:'order',component:Ordercomp},
  { path:'orderhistory',component:OrderHistory}
];