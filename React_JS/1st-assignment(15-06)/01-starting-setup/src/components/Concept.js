import Card from "./Card";

export default function Concept(props) {
  return (
    <Card>
      <img src={props.data.image} alt={props.data.title} />
      <h2>{props.data.title}</h2>
      <p>{props.data.description}</p>
    </Card>
  );
}
