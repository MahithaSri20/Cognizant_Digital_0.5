import office from "./office.jpg";

function App() {

  const officeList = [
    {
      Name: "DBS",
      Rent: 50000,
      Address: "Chennai"
    },
    {
      Name: "Regus",
      Rent: 75000,
      Address: "Bangalore"
    },
    {
      Name: "WeWork",
      Rent: 65000,
      Address: "Hyderabad"
    }
  ];

  return (
    <div style={{ marginLeft: "50px" }}>

      <h1>Office Space , at Affordable Range</h1>

      {officeList.map((item, index) => (

        <div key={index} style={{ marginBottom: "40px" }}>

          <img
            src={office}
            alt="Office Space"
            width="250"
            height="180"
          />

          <h2>Name: {item.Name}</h2>

          <h3
            style={{
              color: item.Rent < 60000 ? "red" : "green"
            }}
          >
            Rent Rs. {item.Rent}
          </h3>

          <h3>Address: {item.Address}</h3>

        </div>

      ))}

    </div>
  );
}

export default App;