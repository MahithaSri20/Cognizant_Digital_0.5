import React, { Component } from "react";

class ComplaintRegister extends Component {
  constructor(props) {
    super(props);

    this.state = {
      ename: "",
      complaint: ""
    };
  }

  handleChange = (event) => {
    this.setState({
      [event.target.name]: event.target.value
    });
  };

  handleSubmit = (event) => {
    event.preventDefault();

    const referenceNumber =
      "TKT" + Math.floor(100000 + Math.random() * 900000);

    const msg =
      "Thanks " +
      this.state.ename +
      "\nYour Complaint was Submitted.\nReference No: " +
      referenceNumber;

    alert(msg);
  };

  render() {
    return (
      <div>
        <h1>Register your complaints here!!!</h1>

        <form onSubmit={this.handleSubmit}>
          <div>
            <label>Name: </label>
            <input
              type="text"
              name="ename"
              value={this.state.ename}
              onChange={this.handleChange}
            />
          </div>

          <br />

          <div>
            <label>Complaint: </label>
            <textarea
              name="complaint"
              value={this.state.complaint}
              onChange={this.handleChange}
            />
          </div>

          <br />

          <button type="submit">Submit</button>
        </form>
      </div>
    );
  }
}

export default ComplaintRegister;