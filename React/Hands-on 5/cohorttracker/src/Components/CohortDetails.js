import styles from "../Stylesheets/CohortDetails.module.css";

function CohortDetails(props) {
  const headingStyle = {
    color: props.status === "ongoing" ? "green" : "blue"
  };

  return (
    <div className={styles.box}>
      <h3 style={headingStyle}>
        {props.name}
      </h3>

      <dl>
        <dt>Started On</dt>
        <dd>{props.startedOn}</dd>

        <dt>Current Coach</dt>
        <dd>{props.coach}</dd>

        <dt>Trainer</dt>
        <dd>{props.trainer}</dd>

        <dt>Status</dt>
        <dd>{props.status}</dd>
      </dl>
    </div>
  );
}

export default CohortDetails;