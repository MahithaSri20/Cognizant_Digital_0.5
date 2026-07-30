import { BrowserRouter, Routes, Route, Link, Navigate } from "react-router-dom";

import Home from "./Components/Home";
import TrainersList from "./Components/TrainersList";
import TrainerDetails from "./Components/TrainerDetails";

import trainersMock from "./TrainersMock";

function App() {
  return (
    <BrowserRouter>
      <div>
        <h1>My Academy Trainers App</h1>

        <Link to="/home">Home</Link>
        {" | "}
        <Link to="/trainers">Show Trainers</Link>

        <hr />

        <Routes>
          <Route path="/" element={<Navigate to="/home" />} />

          <Route path="/home" element={<Home />} />

          <Route
            path="/trainers"
            element={<TrainersList trainers={trainersMock} />}
          />

          <Route
            path="/trainer/:trainerId"
            element={<TrainerDetails />}
          />
        </Routes>
      </div>
    </BrowserRouter>
  );
}

export default App;