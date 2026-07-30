import { useState } from "react";

import Greeting from "./Components/Greeting";
import LoginButton from "./Components/LoginButton";
import LogoutButton from "./Components/LogoutButton";

function App() {

  const [isLoggedIn, setIsLoggedIn] = useState(false);

  const handleLogin = () => {
    setIsLoggedIn(true);
  };

  const handleLogout = () => {
    setIsLoggedIn(false);
  };

  return (
    <div style={{ margin: "40px" }}>

      <Greeting isLoggedIn={isLoggedIn} />

      <br />

      {isLoggedIn ? (
        <LogoutButton onClick={handleLogout} />
      ) : (
        <LoginButton onClick={handleLogin} />
      )}

    </div>
  );
}

export default App;