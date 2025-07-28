import React from 'react';
import CohortDetails from './Component/CohortDetails';

function App() {
  const cohortData = [
    {
      name: "React Bootcamp",
      status: "ongoing",
      startDate: "2025-07-01",
      endDate: "2025-08-15",
    },
    {
      name: "Python ML Cohort",
      status: "completed",
      startDate: "2025-05-01",
      endDate: "2025-06-30",
    },
  ];

  return (
    <div>
      <h1>Cohort Dashboard</h1>
      {cohortData.map((cohort, index) => (
        <CohortDetails key={index} cohort={cohort} />
      ))}
    </div>
  );
}

export default App;
