import { NgModule } from "@angular/core";
import { CommonModule } from "@angular/common";
import { DashboardComponent } from "./dashboard/dashboard.component";
import { Routes, RouterModule } from "@angular/router";
import { TempComponent } from "./temp/temp.component";
const oerouting: Routes = [
  { path: "dashboard", component: DashboardComponent },
  { path: "temp", component: TempComponent }
];
@NgModule({
  declarations: [DashboardComponent, TempComponent],
  imports: [CommonModule, RouterModule.forChild(oerouting)]
})
export class OEModule {}
