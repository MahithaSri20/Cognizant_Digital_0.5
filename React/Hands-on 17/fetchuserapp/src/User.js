import React, { Component } from "react";

class User extends Component {
  constructor(props) {
    super(props);

    this.state = {
      user: {},
      loading: true
    };
  }

  componentDidMount() {
    const url = "https://randomuser.me/api/";

    fetch(url)
      .then((response) => response.json())
      .then((data) => {
        this.setState({
          user: data.results[0],
          loading: false
        });
      })
      .catch((error) => {
        console.log(error);
        this.setState({
          loading: false
        });
      });
  }

  render() {
    const { user, loading } = this.state;

    if (loading) {
      return <h2>Loading...</h2>;
    }

    return (
      <div>
        <h2>
          {user.name.title} {user.name.first} {user.name.last}
        </h2>

        <img
          src={user.picture.large}
          alt="User"
        />
      </div>
    );
  }
}

export default User;