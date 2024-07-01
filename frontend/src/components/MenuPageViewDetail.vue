<template>

    <v-card outlined>
        <v-card-title>
            MenuPage # {{$route.params.id }}
        </v-card-title>

        <v-card-text>
            <div>
                <String label="MenuId" v-model="item.menuId" :editMode="editMode" @change="change" />
            </div>
            <div>
                <String label="MenuName" v-model="item.menuName" :editMode="editMode" @change="change" />
            </div>
            <div>
                <String label="MenuPrice" v-model="item.menuPrice" :editMode="editMode" @change="change" />
            </div>
            <div>
                <String label="MenuStatus" v-model="item.menuStatus" :editMode="editMode" @change="change" />
            </div>
        </v-card-text>
    </v-card>

</template>

<script>
  const axios = require('axios').default;

  export default {
    name: 'MenuPageViewDetail',
    props: {
      value: Object,
    },
    data: () => ({
        item : [],
    }),
    async created() {
      var params = this.$route.params;
      var temp = await axios.get(axios.fixUrl('/menuPages/' + params.id))

      this.item = temp.data;

    },
    methods: {
    }
  }
</script>

