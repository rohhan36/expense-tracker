import ExpenseItem from "./ExpenseItem";
import Card from "./Card";
import ExpenseFilter from "./ExpenseFilter";
import ExpenseGraph from "./ExpenseGraph";
import { useState } from "react";

function Expenses(props) {
  const errorMsg = <p className="error-msg">No expenses found!</p>;
  const [filterdYear, setFilteredYear] = useState("2023");
  const filterChangeHandeler = (year) => {
    setFilteredYear(year);
  };

  const filterdExpenses = props.data.filter((expense) => expense.date.getFullYear().toString() === filterdYear);

  return (
    <Card className="expenses">
      <ExpenseFilter onFilterChange={filterChangeHandeler} selected={filterdYear} />
      <ExpenseGraph expenses={filterdExpenses} />
      {filterdExpenses.length === 0 && errorMsg}
      {filterdExpenses.map((expenseData) => (
        <ExpenseItem data={expenseData} key={expenseData.id} />
      ))}
    </Card>
  );
}

export default Expenses;
