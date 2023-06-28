import { useState } from "react";

const ExpenseForm = (props) => {
  const getId = () => {
    return Math.random();
  };

  const [newAmount, setnewAmount] = useState("");
  const [newTitle, setNewTitle] = useState("");
  const [newDate, setNewDate] = useState("");
  const [newCategory, setNewCategory] = useState("");

  const expenseChangeHandeler = (e) => {
    setnewAmount(e.target.value);
  };

  const titleChangeHandeler = (e) => {
    setNewTitle(e.target.value);
  };

  const dateChangeHandeler = (e) => {
    setNewDate(e.target.value);
  };

  const categoryChangeHandeler = (e) => {
    setNewCategory(e.target.value);
  };

  const submitHandeler = (e) => {
    e.preventDefault();
    const newExpenseData = {
      id: getId(),
      title: newTitle,
      price: parseInt(newAmount),
      date: new Date(newDate),
      category: newCategory,
    };

    props.onExpenseSave(newExpenseData);
    setNewDate("");
    setnewAmount("");
    setNewTitle("");
    setNewCategory("DEFAULT");
  };

  const actionHandeler = (e) => {
    e.preventDefault();
    props.onBtnClick(true);
  };

  return (
    <form className="new-expense-form" onSubmit={submitHandeler}>
      <div className="new-expense-controler">
        <input type="number" className="new-expense-amount" value={newAmount} onChange={expenseChangeHandeler} min="0.01" step="0.01" placeholder="$0" required />
      </div>
      <div className="new-expense-controler">
        <input type="text" className="new-expense-title" value={newTitle} onChange={titleChangeHandeler} placeholder="Title" required />
      </div>
      <div className="new-expense-controler">
        <input type="date" className="new-expense-date" value={newDate} onChange={dateChangeHandeler} placeholder="Select date" required />
      </div>

      <select required onChange={categoryChangeHandeler} defaultValue={"DEFAULT"}>
        <option disabled value={"DEFAULT"}>
          Choose Category
        </option>
        <option value="health">Health</option>
        <option value="food">Food</option>
        <option value="shopping">Shopping</option>
        <option value="entertainment">Entertainment</option>
        <option value="travel">Travel</option>
        <option value="home">Home</option>
        <option value="insurance">Insurance</option>
        <option value="other">Other</option>
      </select>

      <div className="new-expense-buttons">
        <button type="submit" className="new-expense-btn form-btn">
          Add
        </button>
        <button onClick={actionHandeler} className="new-expense-btn form-btn">
          Cancel
        </button>
      </div>
    </form>
  );
};

export default ExpenseForm;
