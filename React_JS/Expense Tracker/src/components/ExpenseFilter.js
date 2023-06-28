const ExpenseFilter = (props) => {
  const changeHandler = (e) => {
    props.onFilterChange(e.target.value);
  };
  return (
    <select className="expense-filter" onChange={changeHandler} defaultValue={props.selected}>
      <option value="2023">2023</option>
      <option value="2022">2022</option>
      <option value="2021">2021</option>
      <option value="2020">2020</option>
      <option value="2019">2019</option>
    </select>
  );
};

export default ExpenseFilter;
