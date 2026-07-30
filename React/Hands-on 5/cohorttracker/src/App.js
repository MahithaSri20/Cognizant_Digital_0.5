import CohortDetails from "./Components/CohortDetails";

function App() {
  return (
    <div>
      <h2>Cohorts Details</h2>

      <CohortDetails
        name="INTADMDF10 .NET FSD"
        startedOn="22-Feb-2022"
        coach="Sathya"
        trainer="Tarun"
        status="ongoing"
      />

      <CohortDetails
        name="ADM21JF014 Java FSD"
        startedOn="10-Sep-2021"
        coach="Raghu"
        trainer="Elisa Smith"
        status="completed"
      />

      <CohortDetails
        name="CDBJF21025 Java FSD"
        startedOn="01-Dec-2021"
        coach="Dinesh"
        trainer="John Doe"
        status="ongoing"
      />
    </div>
  );
}

export default App;