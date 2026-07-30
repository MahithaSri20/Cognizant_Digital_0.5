import CurrencyConvertor from "./Components/CurrencyConvertor";

function App() {

  let count = 0;

  const increment = () => {
    count++;
    alert("Hello! Member");
  };

  const decrement = () => {
    count--;
  };

  const sayWelcome = (message) => {
    alert(message);
  };

  const handleClick = () => {
    alert("I was clicked");
  };

  return (
    <div style={{ margin: "20px" }}>

      <h2>{count}</h2>

      <button onClick={increment}>
        Increment
      </button>

      <br /><br />

      <button onClick={decrement}>
        Decrement
      </button>

      <br /><br />

      <button onClick={() => sayWelcome("Welcome")}>
        Say Welcome
      </button>

      <br /><br />

      <button onClick={handleClick}>
        Click on Me
      </button>

      <br /><br /><br />

      <CurrencyConvertor />

    </div>
  );
}

export default App;