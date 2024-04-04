<template id="zoo">
  <h1>Animals in {{zooName}}</h1>
  <ul>
    <li v-for="animal in animals" class="list-element">
      <h2>{{animal.id + " - " + animal.name + " - " + animal.species}}</h2>
    </li>
  </ul>
</template>
<script>
app.component("zoo-detail", {
  template: "#zoo",
  data: () => ({
    animals: [],
  }),
  created() {
    const zooNameParam = this.$javalin.pathParams["zooName"];
    fetch (`/api/zoo/${zooNameParam}`)
        .then(res => res.json())
        .then(res => {
          this.animals = res
          this.zooName = zooNameParam
        })
        .catch(() => alert("Error while fetching animals for zoo " + zooNameParam))
  }
});
</script>
<style>
.list-element {
  color: darkblue;
}
</style>