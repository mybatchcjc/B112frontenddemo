import { NgModule } from "@angular/core";
import { CommonModule } from "@angular/common";
import { BrowserModule } from "@angular/platform-browser";
import { Routes, RouterModule } from "@angular/router";

import { AdminLayoutComponent } from "./layouts/admin-layout/admin-layout.component";
import { LoginComponent } from "./login/login.component";
import { REModule } from "./modulelayout/re/re.module";
import { CMModule } from "./modulelayout/cm/cm.module";
import { BMModule } from "./modulelayout/bm/bm.module";
import { AHModule } from "./modulelayout/ah/ah.module";
import { OEModule } from "./modulelayout/oe/oe.module";

const routes: Routes = [
  {
    path: "",
    redirectTo: "dashboard",
    pathMatch: "full"
  },
  {
    path: "",
    component: LoginComponent
  },
  {
    path:'role',component:AdminLayoutComponent,
    children:[
      {path:'re',loadChildren:()=>REModule},
      {path:'cm',loadChildren:()=>CMModule},
      {path:'bm',loadChildren:()=>BMModule},
      {path:'ah',loadChildren:()=>AHModule},
      {path:'oe',loadChildren:()=>OEModule}
    ]
  },
  // {
  //   path: "",
  //   component: AdminLayoutComponent,
  //   children: [
  //     {
  //       path: "",
  //       loadChildren:
  //         "./layouts/admin-layout/admin-layout.module#AdminLayoutModule"
  //     }
  //   ]
  // },
  {
    path: "**",
    redirectTo: "dashboard"
  }
];

@NgModule({
  imports: [
    CommonModule,
    BrowserModule,
    RouterModule.forRoot(routes, {
      useHash: true
    })
  ],
  exports: []
})
export class AppRoutingModule {}
