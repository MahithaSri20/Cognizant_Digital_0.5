import { useParams } from "react-router-dom";
import trainersMock from "../TrainersMock";

function TrainerDetails() {
  const { trainerId } = useParams();

  const trainer = trainersMock.find(
    (t) => t.trainerId === trainerId
  );

  if (!trainer) {
    return <h3>Trainer Not Found</h3>;
  }

  return (
    <div>
      <h3>Trainers Details</h3>

      <h4>
        {trainer.name} ({trainer.technology})
      </h4>

      <p>{trainer.email}</p>

      <p>{trainer.phone}</p>

      <ul>
        {trainer.skills.map((skill, index) => (
          <li key={index}>{skill}</li>
        ))}
      </ul>
    </div>
  );
}

export default TrainerDetails;