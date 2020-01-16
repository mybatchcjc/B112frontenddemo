import { Component, OnInit } from "@angular/core";
import { Router } from "@angular/router";
import { User } from "app/model/user";

@Component({
  selector: "app-login",
  templateUrl: "./login.component.html",
  styleUrls: ["./login.component.scss"]
})
export class LoginComponent implements OnInit {
  // username: string;
  // password: string;

  public show = true;
  public notshow = true;
  public username = "";
  public password = "";
  public email = "";

  us: User = {
    userId: null,
    username: "",
    password: "",
    userRole: "",
    branchcode: ""
  };

  constructor(private router: Router) {}

  ngOnInit() {}
  toggle() {
    console.log("toggle");
    this.show = !this.show;
    // CHANGE THE NAME OF THE BUTTON.
  }
  toggle1() {
    this.show = true;
    // CHANGE THE NAME OF THE BUTTON.
  }
  login(username, password) {
    if (username === "oe" && password === "oe") {
      console.log("in oe");
      sessionStorage.setItem("role", "oe");
      this.router.navigateByUrl("role/oe/dashboard");
    }
    if (username === "re" && password === "re") {
      console.log(username);
      console.log("in re");
      sessionStorage.setItem("role", "re");
      this.router.navigateByUrl("role/re/dashboard");
    }
    if (username === "bm" && password === "bm") {
      console.log("in bm");
      sessionStorage.setItem("role", "bm");
      this.router.navigateByUrl("role/bm/dashboard");
    }
    if (username === "ac" && password === "ac") {
      console.log("in ac");
      sessionStorage.setItem("role", "ac");
      this.router.navigateByUrl("role/ac/dashboard");
    }
    if (username === "oh" && password === "oh") {
      console.log("in oh");
      sessionStorage.setItem("role", "oh");
      this.router.navigateByUrl("role/oh/dashboard");
    }
    if (username === "audithead" && password === "audithead") {
      console.log("in audithead");
      sessionStorage.setItem("role", "audithead");
      this.router.navigateByUrl("role/audithead/dashboard");
    }
    if (username === "cm" && password === "cm") {
      console.log("in cm");
      sessionStorage.setItem("role", "cm");
      this.router.navigateByUrl("role/cm/dashboard");
    }
  }
}
