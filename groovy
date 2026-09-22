<!DOCTYPE html>
<html lang="en">
<head>
  <meta charset="UTF-8">
  <title>DevOps Pipeline Simulator</title>
  <style>
    body {
      font-family: Arial, sans-serif;
      background: #eef2f7;
      text-align: center;
      padding: 20px;
    }
    h1 {
      color: #2c3e50;
    }
    .stage {
      display: inline-block;
      margin: 15px;
      padding: 20px;
      border-radius: 8px;
      background: #fff;
      box-shadow: 0 2px 5px rgba(0,0,0,0.2);
    }
    button {
      padding: 10px 20px;
      margin-top: 10px;
      border: none;
      border-radius: 5px;
      background: #3498db;
      color: white;
      font-weight: bold;
      cursor: pointer;
    }
    button:hover {
      background: #2980b9;
    }
    #log {
      margin-top: 30px;
      padding: 15px;
      background: #f9f9f9;
      border: 1px solid #ccc;
      text-align: left;
      max-width: 600px;
      margin-left: auto;
      margin-right: auto;
    }
  </style>
</head>
<body>
  <h1>DevOps Continuous Testing Framework</h1>
  <p>Click each stage to simulate pipeline execution</p>

  <div class="stage">
    <h3>1. Developer Commit</h3>
    <button onclick="runStage('Code committed to GitHub')">Run</button>
  </div>

  <div class="stage">
    <h3>2. GitHub Actions</h3>
    <button onclick="runStage('GitHub Actions triggered')">Run</button>
  </div>

  <div class="stage">
    <h3>3. Jenkins Build</h3>
    <button onclick="runStage('Jenkins build successful')">Run</button>
  </div>

  <div class="stage">
    <h3>4. Automated Testing</h3>
    <button onclick="runStage('All test cases passed')">Run</button>
  </div>

  <div class="stage">
    <h3>5. Deployment</h3>
    <button onclick="runStage('Application deployed to Kubernetes cluster')">Run</button>
  </div>

  <div class="stage">
    <h3>6. Monitoring</h3>
    <button onclick="runStage('Prometheus & Grafana monitoring active')">Run</button>
  </div>

  <div id="log">
    <h3>Pipeline Log</h3>
    <ul id="logList"></ul>
  </div>

  <script>
    function runStage(message) {
      const logList = document.getElementById("logList");
      const li = document.createElement("li");
      li.textContent = message;
      logList.appendChild(li);
    }
  </script>
</body>
</html>
