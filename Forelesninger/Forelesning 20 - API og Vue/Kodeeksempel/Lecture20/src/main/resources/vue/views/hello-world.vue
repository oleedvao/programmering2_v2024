<template id="template">
  <h1 class="header">Hello, Vue!</h1>
</template>
<script>
  app.component("hello-world", {template: "#template"})
</script>
<style>
.header {
  color: red;
  font-size: 50px;
}
</style>