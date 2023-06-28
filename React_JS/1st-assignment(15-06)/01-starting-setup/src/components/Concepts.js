import Concept from "./Concept";

export default function Concepts(props) {
  return (
    <div id="concepts">
      <Concept data={props.data[0]} />
      <Concept data={props.data[1]} />
      <Concept data={props.data[2]} />
    </div>
  );
}
