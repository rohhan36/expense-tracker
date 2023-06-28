import Card from "./Card";
import Amount from "./Amount";
import ExpenseLogo from "./ExpenseLogo";

function ExpenseItem(props) {
  return (
    <Card className="expense-item">
      <div>
        <ExpenseLogo data={props.data} />
        <div className="expense-name"> {props.data.title} </div>
      </div>
      <Amount data={props.data} />
    </Card>
  );
}

export default ExpenseItem;
