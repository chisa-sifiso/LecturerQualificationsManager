<!DOCTYPE html>
<html lang="en">
<head>
  <meta charset="UTF-8">
  <meta name="viewport" content="width=device-width, initial-scale=1.0">
  
</head>
<body>

<h1>Lecturer Qualifications Manager</h1>

<h2>Overview</h2>
<p>This project is designed to manage and display a lecturer's qualifications. It allows the user to:</p>
<ul>
  <li>Add qualifications for a lecturer.</li>
  <li>Remove qualifications.</li>
  <li>Retrieve the highest qualification based on a qualification level.</li>
</ul>

<h2>Features</h2>
<ul>
  <li><strong>Add Qualifications</strong>: Add multiple qualifications to a lecturer.</li>
  <li><strong>Remove Qualifications</strong>: Remove any qualification from the lecturer's qualification list.</li>
  <li><strong>Highest Qualification</strong>: Get the lecturer's highest qualification by comparing qualification levels.</li>
</ul>

<h2>Classes and Structure</h2>
<ul>
  <li><strong>Lecturer</strong>: A class that holds a lecturer's surname and an array of qualifications.</li>
  <li><strong>Qualification</strong>: A class representing a qualification with fields like degree name, year obtained, and qualification level.</li>
</ul>

<h2>Usage</h2>
<p>The main class <code>ShowLecturer</code> demonstrates adding qualifications to a lecturer, retrieving the list of qualifications, and finding the highest qualification.</p>

<h3>Example Output:</h3>
<pre>
Diploma IT
MSc in Computer Science
PhD in Computer Science
MSc in Mathematics
MSc in Mathematics

PhD in Computer Science
</pre>

<h2>How to Run</h2>
<ol>
  <li>Clone the repository:
    <pre><code>git clone https://github.com/your-username/LecturerQualificationsManager.git</code></pre>
  </li>
  <li>Compile the Java files and run the <code>ShowLecturer</code> class to see the example.</li>
</ol>

<h2>License</h2>
<p>This project is open-source and available under the <a href="https://opensource.org/licenses/MIT">MIT License</a>.</p>

</body>
</html>
