const AddExpenseButton = (props) => {
  const clickHandeler = () => {
    props.onBtnClick(false);
  };
  return (
    <button onClick={clickHandeler} className="new-expense-btn">
      Add New Expense
    </button>
  );
};
export default AddExpenseButton;
