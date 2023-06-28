export default function Card(props) {
  const className = "card " + props.className;
  return <div className={className}> {props.children}</div>;
}
