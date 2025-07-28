import React from 'react';
import '../Stylesheets/mystyle.css';

function CalculateScore() {
  const name = "Akanksha";
  const school = "Bhashyam High School";
  const total = 977;
  const goal = 1000;

  const average = (total / goal) * 100;

  return (
    <div className="score-card">
      <h1>Student Score Report</h1>
      <p><strong>Name:</strong> {name}</p>
      <p><strong>School:</strong> {school}</p>
      <p><strong>Total Marks:</strong> {total}</p>
      <p><strong>Goal:</strong> {goal}</p>
      <p><strong>Average Score:</strong> {average.toFixed(2)}%</p>
    </div>
  );
}

export default CalculateScore;
