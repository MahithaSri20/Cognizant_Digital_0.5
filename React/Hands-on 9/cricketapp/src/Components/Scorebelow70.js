import React from "react";

function Scorebelow70({ players }) {

  const players70 = players.filter((item) => item.score <= 70);

  return (
    <div>
      {players70.map((item, index) => (
        <div key={index}>
          Mr. {item.name} <span>{item.score}</span>
        </div>
      ))}
    </div>
  );
}

export default Scorebelow70;