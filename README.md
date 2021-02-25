<h2>Run selenium script in existing browser</h2>
<h4> 
  1. Launch browser Manaully.
  2. Launch browser through automation script.
</h4>

<h5>Step 1. Launch browser Manaully.</h5>
<p>To enable Chrome to open a port for remote debugging, we need to launch it with a custom flag</p>
<pre>
chrome.exe --remote-debugging-port=9222 --user-data-dir="any local folder"
</pre>
