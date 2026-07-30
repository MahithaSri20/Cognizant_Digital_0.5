import React from "react";

function OddPlayers([first, , third, , fifth]) {
  return (
    <div>
      <div>First : {first}</div>
      <div>Third : {third}</div>
      <div>Fifth : {fifth}</div>
    </div>
  );
}

export default OddPlayers;