<template>
  <TR>
    <TD>{{objectData.idPoezd}}</TD>
    <TD>{{objectData.vrsvop}}</TD>
    <TD>{{objectData.disEsr}}</TD>
    <TD>{{objectData.disPark}}</TD>
  </TR>
</template>

<script>
export default {
  name: "ObjectRow",
  props:{
    objectData: Object
  }
}
</script>

<style scoped>

</style>