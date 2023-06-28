import { useState } from "react";
import Expenses from "./components/Expenses";
import NewExpense from "./components/NewExpense";

function App() {
  const DUMMY_EXPENSES = [
    { id: 1, title: "Video Game", price: 120, date: new Date("02-24-2023"), category: "entertainment" },
    { id: 2, title: "Burger", price: 30, date: new Date("01-05-2023"), category: "food" },
    { id: 3, title: "Hoodie", price: 55.2, date: new Date("02-24-2023"), category: "shopping" },
    { id: 4, title: "Pizza", price: 25, date: new Date("04-05-2022"), category: "food" },
    { id: 5, title: "Watch", price: 45, date: new Date("06-01-2021"), category: "shopping" },
    { id: 6, title: "Flight Ticket", price: 60, date: new Date("03-03-2023"), category: "travel" },
    { id: 7, title: "Health Insurance", price: 150, date: new Date("04-04-2023"), category: "insurance" },
    { id: 8, title: "Movie Night", price: 60, date: new Date("01-05-2022"), category: "entertainment" },
  ];

  const [expenses, setNewExpense] = useState(DUMMY_EXPENSES);
  const addExpenseHandeler = (newExpese) => {
    setNewExpense((prevExpenses) => {
      console.log(expenses);
      return [newExpese, ...prevExpenses];
    });
  };

  return (
    <div className="main">
      <NewExpense data={expenses} onAddExpense={addExpenseHandeler} />
      <Expenses data={expenses}></Expenses>
    </div>
  );
}

export default App;
