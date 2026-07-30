import React from "react";

function ListofPlayers({ players }) {
  return (
    <div>
      {players.map((item, index) => (
        <div key={index}>
          Mr. {item.name} <span>{item.score}</span>
        </div>
      ))}
    </div>
  );
}

export default ListofPlayers;