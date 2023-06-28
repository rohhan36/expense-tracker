export default function Amount(props) {
  const months = ["Jan", "Feb", "Mar", "Apr", "May", "Jun", "July", "Aug", "Sept", "Oct", "Nov", "Dec"];
  const month = months[props.data.date.getMonth()];
  const date = props.data.date.getDate();
  const year = props.data.date.getFullYear();

  return (
    <div className="amount">
      <div className="price"> ${props.data.price.toFixed(2)} </div>
      <div className="date">{`${date} ${month} ${year}`}</div>
    </div>
  );
}
