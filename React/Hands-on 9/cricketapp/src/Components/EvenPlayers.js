import React from "react";

function EvenPlayers([, second, , fourth, , sixth]) {
  return (
    <div>
      <div>Second : {second}</div>
      <div>Fourth : {fourth}</div>
      <div>Sixth : {sixth}</div>
    </div>
  );
}

export default EvenPlayers;