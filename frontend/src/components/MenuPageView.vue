<template>

    <v-data-table
        :headers="headers"
        :items="menuPage"
        :items-per-page="5"
        class="elevation-1"
    ></v-data-table>

</template>

<script>
    const axios = require('axios').default;

    export default {
        name: 'MenuPageView',
        props: {
            value: Object,
            editMode: Boolean,
            isNew: Boolean
        },
        data: () => ({
            headers: [
                { text: "id", value: "id" },
                { text: "menuId", value: "menuId" },
                { text: "menuName", value: "menuName" },
                { text: "menuPrice", value: "menuPrice" },
                { text: "menuStatus", value: "menuStatus" },
            ],
            menuPage : [],
        }),
          async created() {
            var temp = await axios.get(axios.fixUrl('/menuPages'))

            temp.data._embedded.menuPages.map(obj => obj.id=obj._links.self.href.split("/")[obj._links.self.href.split("/").length - 1])

            this.menuPage = temp.data._embedded.menuPages;
        },
        methods: {
        }
    }
</script>

