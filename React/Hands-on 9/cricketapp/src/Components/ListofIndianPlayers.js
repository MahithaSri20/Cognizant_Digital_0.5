import React from "react";

const T20Players = [
  "First Player",
  "Second Player",
  "Third Player"
];

const RanjiTrophyPlayers = [
  "Fourth Player",
  "Fifth Player",
  "Sixth Player"
];

export const IndianPlayers = [
  ...T20Players,
  ...RanjiTrophyPlayers
];

function ListofIndianPlayers({ IndianPlayers }) {
  return (
    <div>
      {IndianPlayers.map((player, index) => (
        <div key={index}>Mr. {player}</div>
      ))}
    </div>
  );
}

export default ListofIndianPlayers;