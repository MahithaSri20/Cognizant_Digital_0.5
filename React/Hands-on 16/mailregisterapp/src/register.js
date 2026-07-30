import React, { Component } from "react";

class Register extends Component {
  constructor(props) {
    super(props);

    this.state = {
      name: "",
      email: "",
      password: "",
      errors: {
        fullName: "",
        email: "",
        password: ""
      }
    };
  }

  handleChange = (event) => {
    const { name, value } = event.target;

    this.setState({
      [name]: value
    });

    switch (name) {
      case "fullName":
        this.setState({
          errors: {
            ...this.state.errors,
            fullName:
              value.length < 5
                ? "Full Name must be 5 characters long!"
                : ""
          }
        });
        break;

      case "email":
        this.setState({
          errors: {
            ...this.state.errors,
            email:
              value.includes("@") && value.includes(".")
                ? ""
                : "Email is not valid"
          }
        });
        break;

      case "password":
        this.setState({
          errors: {
            ...this.state.errors,
            password:
              value.length < 8
                ? "Password must be 8 characters long!"
                : ""
          }
        });
        break;

      default:
        break;
    }
  };

  handleSubmit = (event) => {
    event.preventDefault();

    const { fullName, email, password, errors } = this.state;

    if (
      fullName.length >= 5 &&
      email.includes("@") &&
      email.includes(".") &&
      password.length >= 8 &&
      errors.fullName === "" &&
      errors.email === "" &&
      errors.password === ""
    ) {
      alert("Valid Form");
    } else {
      alert("Please enter valid details");
    }
  };

  render() {
    return (
      <div>
        <h1>Register Here!!!</h1>

        <form onSubmit={this.handleSubmit}>
          <div>
            <label>Name: </label>
            <input
              type="text"
              name="fullName"
              value={this.state.fullName}
              onChange={this.handleChange}
            />
            <span>{this.state.errors.fullName}</span>
          </div>

          <br />

          <div>
            <label>Email: </label>
            <input
              type="text"
              name="email"
              value={this.state.email}
              onChange={this.handleChange}
            />
            <span>{this.state.errors.email}</span>
          </div>

          <br />

          <div>
            <label>Password: </label>
            <input
              type="password"
              name="password"
              value={this.state.password}
              onChange={this.handleChange}
            />
            <span>{this.state.errors.password}</span>
          </div>

          <br />

          <button type="submit">Submit</button>
        </form>
      </div>
    );
  }
}

export default Register;