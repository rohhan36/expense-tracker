import { useState } from "react";
import ExpenseForm from "./ExpenseForm";
import AddExpenseButton from "./AddExpenseButton";
import Card from "./Card";

const NewExpense = (props) => {
  const [isAdding, setIsAdding] = useState(true);
  const btnAction = (value) => {
    setIsAdding(value);
  };

  const addExpenseOnSave = (newEnterdExpense) => {
    const expenseData = {
      ...newEnterdExpense,
    };
    props.onAddExpense(expenseData);

    setIsAdding(true);
  };

  let formContent = isAdding ? <AddExpenseButton onBtnClick={btnAction} /> : <ExpenseForm onBtnClick={btnAction} onExpenseSave={addExpenseOnSave} />;
  return <Card className={"add-new-expense-container"}>{formContent}</Card>;
};

export default NewExpense;
